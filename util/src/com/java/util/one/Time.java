package com.java.util.one;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.YEARS;
/** @author JingliHuang
 *  * 2019.03.15
 * Java8日期和时间处理
 */
public class Time {
    public static void main(String[] args) {
        //获取今天的日期
        LocalDate today = LocalDate.now();
        System.out.println("今天的日期:" + today);
        //获取年 月 日 信息
        LocalDate today1 = LocalDate.now();
        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        System.out.printf("Year : %d  Month : %d  day : %d t %n", year, month, day);
        //在Java8处理特定日期
        LocalDate dateOfBirth = LocalDate.of(100, 01, 01);
        System.out.println("Your Date of birth is : " + dateOfBirth);
        //在Java8判断两个日期是否相等
        LocalDate date1 = LocalDate.of(2014, 01, 14);
        if (date1.equals(today)) {
            System.out.printf("Today %s and date1 %s are same one %n", today, date1);
        }
        //在Java 8中检查像生日这种周期性事件
        LocalDate dateOfBirth1 = LocalDate.of(2010, 01, 14);
        MonthDay birthday = MonthDay.of(dateOfBirth.getMonth(), dateOfBirth.getDayOfMonth());
        MonthDay currentMonthDay = MonthDay.from(today);

        if(currentMonthDay.equals(birthday)){
            System.out.println("Many Many happy returns of the day !!");
        }else{
            System.out.println("Sorry, today is not your birthday");
        }
        //在Java 8中获取当前时间
        LocalTime time = LocalTime.now();
        System.out.println("local time now : " + time);
        //如何在现有的时间上加小时
        LocalTime time1 = LocalTime.now();
        LocalTime newTime = time.plusHours(2); // adding test hours
        System.out.println("Time after 2 hours : " +  newTime); //计算一周后的日期
        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("Today is : " + today);
        System.out.println("Date after 1 week : " + nextWeek);

        //计算一年前或一年后的日期
        LocalDate previousYear = today.minus(1, YEARS);
        System.out.println("Date before 1 year : " + previousYear);
        LocalDate nextYear = today.plus(1, YEARS);
        System.out.println("Date after 1 year : " + nextYear);

        //使用Java 8的Clock时钟类
        Clock clock = Clock.systemUTC();
        System.out.println("Clock : " + clock);
        Clock defaultClock = Clock.systemDefaultZone();
        System.out.println("Clock : " + clock);

        //用Java判断日期是早于还是晚于另一个日期
        LocalDate tomorrow = LocalDate.of(2019, 3, 16);
        if(tomorrow.isAfter(today)){
            System.out.println("Tomorrow comes after today");
        }
        LocalDate yesterday = today.minus(1, DAYS);
        if(yesterday.isBefore(today)){
            System.out.println("Yesterday is day before today");
        }

        //在Java 8中处理时区
        ZoneId america = ZoneId.of("America/New_York");
        LocalDateTime localtDateAndTime = LocalDateTime.now();
        ZonedDateTime dateAndTimeInNewYork  = ZonedDateTime.of(localtDateAndTime, america );
        System.out.println("Current one and time in a particular timezone : " + dateAndTimeInNewYork);

        //信用卡到期这类固定日期，答案就在YearMonth
        YearMonth currentYearMonth = YearMonth.now();
        System.out.printf("Days in month year %s: %d%n", currentYearMonth, currentYearMonth.lengthOfMonth());
        YearMonth creditCardExpiry = YearMonth.of(2018, Month.MARCH);
        System.out.printf("Your credit card expires on %s %n", creditCardExpiry);

        //在Java 8中检查闰年
        if(today.isLeapYear()){
            System.out.println("This year is Leap year");
        }else {
            System.out.println("2019 is not a Leap year");
        }

        //计算两个日期之间的天数和月数
        LocalDate java8Release = LocalDate.of(2019, Month.MARCH, 14);
        Period periodToNextJavaRelease = Period.between(today, java8Release);
        System.out.println("Months left between today and Java 8 release : "
                + periodToNextJavaRelease.getMonths() );

        //包含时差信息的日期和时间
        LocalDateTime datetime = LocalDateTime.of(2019, Month.MARCH, 14, 19, 30);
        ZoneOffset offset = ZoneOffset.of("+05:30");
        OffsetDateTime date = OffsetDateTime.of(datetime, offset);
        System.out.println("Date and Time with timezone offset in Java : " + date);

        //在Java 8中获取当前的时间戳
        Instant timestamp = Instant.now();
        System.out.println("What is value.of this instant " + timestamp);

        //在Java 8中如何使用预定义的格式化工具去解析或格式化日期
        String dayAfterTommorrow = "20190315";
        LocalDate formatted = LocalDate.parse(dayAfterTommorrow,
                DateTimeFormatter.BASIC_ISO_DATE);
        System.out.printf("Date generated from String %s is %s %n",
                dayAfterTommorrow, formatted);

        //在Java中使用自定义格式化工具解析日期
        String goodFriday = "2019.03.15";
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
            LocalDate holiday = LocalDate.parse(goodFriday, formatter);
            System.out.printf("Successfully parsed String %s, one is %s%n", goodFriday, holiday);
        } catch (DateTimeParseException ex) {
            System.out.printf("%s is not parsable!%n", goodFriday);
            ex.printStackTrace();
        }

        //在Java 8中如何把日期转换成字符串
        LocalDateTime arrivalDate  = LocalDateTime.now();
        try {
            DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM dd yyyy  hh:mm a");
            String landing = arrivalDate.format(format);
            System.out.printf("Arriving at :  %s %n", landing);
        } catch (DateTimeException ex) {
            System.out.printf("%s can't be formatted!%n", arrivalDate);
            ex.printStackTrace();
        }
    }
}
