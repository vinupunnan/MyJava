package com.examples.list;

import java.util.ArrayList;
import java.util.List;

public class DeltaUtil {
public static void main(String args[]){
    AuditDetailDto test1 = new AuditDetailDto("<deleetd> commetsFile1 :tst1 <added>commetsFile2:tets2","oldval","newval");
    AuditDetailDto test2 = new AuditDetailDto("<deleetd> commetsFile2 :tst2 <added>commetsFile1:tets2","oldval","newval");
    AuditDetailDto test3 = new AuditDetailDto("<deleetd> commetsFile5 :tst3","oldval","newval");
    List<AuditDetailDto> testList = new ArrayList<>();
    testList.add(test1);
    testList.add(test2);
    testList.add(test3);
    System.out.println(testList.toString());

 TestEnu[] testEnus = TestEnu.values();


    for(AuditDetailDto testDto :testList){
        for(TestEnu enu : testEnus) {
            String str = testDto.getDelta();
            if (str.contains(enu.eclName)) {
             str=  str.replaceAll(enu.eclName,enu.pdgDisplayName);
                testDto.setDelta(str);
            }
        }
    }



    System.out.println(testList);
}
}
