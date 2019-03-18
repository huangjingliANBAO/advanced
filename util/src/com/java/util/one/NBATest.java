package com.java.util.one;

import java.util.ArrayList;
import java.util.List;

public class NBATest {
    public static void main(String[] args) {
        List<NBA> NBAlist = new ArrayList<>();
        NBAlist.add(new NBA("乔丹","飞人","30.1","6.2","5.3"));
        NBAlist.add(new NBA("乔丹","飞人","30.1","6.2","5.3"));
        NBAlist.add(new NBA("乔丹","飞人","30.1","6.2","5.3"));
        NBAlist.add(new NBA("乔丹","飞人","30.1","6.2","5.3"));
        System.out.println("------NBA历史巨星--------");
        System.out.println("球员 绰号 得分 篮板 助攻");
        int length = NBAlist.size();
        for (int i = 0; i < length;i++){
            System.out.println(NBAlist.get(i).getName() + "   " +NBAlist.get(i).getNickname() + "   "+NBAlist.get(i).getScore()+ "   " +NBAlist.get(i).getRebound()+ "   " + NBAlist.get(i).getAssist() );
            System.out.println();
        }
    }
}
