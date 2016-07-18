package com.company.Main.Activity;

import com.company.Main.Model.Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {
//        // write your code here
//        Model model = new Model();
//        ArrayList<Object> pointList = new ArrayList<>();
//        String sampleString = "brandName";
//        pointList.add(sampleString);
//        Model.Point[] points = {new Model.Point("2017/4/25", "Ring"), new Model.Point("2014/3/25", "Yang"), new Model.Point("2019/4/22", "Oauth"), new Model.Point("2013/4/21", "Tine")};
//        model.setPoints(points);
//        pointList.add(points);
////        Arrays.sort(points);
//        String sampleString2 = "brandName2";
//        pointList.add(sampleString2);
//        Model.Point[] points2 = {new Model.Point("2012/4/25", "Honoka"), new Model.Point("2019/3/25", "Umi"), new Model.Point("2020/4/22", "Chika"), new Model.Point("2016/4/21", "Eli")};
//        model.setPoints(points2);
//        pointList.add(points2);
////        Arrays.sort(points2);
//        Collections.sort(pointList,new PointComparator());
//
//        for (int i = 0; i < pointList.size(); i++) {
//            if (pointList.get(i) instanceof String) {
//                System.out.println(pointList.get(i));
//            } else if (pointList.get(i) instanceof Model.Point[]) {
//                for (int j = 0; j < ((Model.Point[]) pointList.get(i)).length; j++) {
//                    System.out.println( ((Model.Point[]) pointList.get(i))[j].getExpireDate()+":"+((Model.Point[]) pointList.get(i))[j].getName());
//                }
//            }
//            System.out.println("-----------");
//        }
//


//        Model model = new Model();
//        ArrayList<Object> pointList = new ArrayList<>();
//        String sampleString = "brandName";
//        pointList.add(sampleString);
//        List<Model.Point> points = new ArrayList<Model.Point>();
//        points.add(new Model.Point("2012/4/25", "Honoka"));
//        points.add(new Model.Point("2017/4/25", "Ring"));
//        points.add(new Model.Point("2020/4/22", "Chika"));
//        points.add(new Model.Point("2016/4/21", "Eli"));
//        points.add(new Model.Point("2013/4/21", "Tine"));
//        model.setPoints(points);
//        pointList.add(points);
//        points.add(new Model.Point("2019/4/22","Oauth"));
//
//
//        Collections.sort(points, new Comparator<Object>() {
//
//            @Override
//            public int compare(Object o1, Object o2) {
//                if (o1 instanceof Model.Point && o2 instanceof Model.Point) {
//
//                    Model.Point point1 = (Model.Point) o1;
//                    Model.Point point2 = (Model.Point) o2;
//                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
//                    try {
//                        Date formatDate1 = sdf.parse(point1.getExpireDate());
//                        Date formatDate2 = sdf.parse(point2.getExpireDate());
//                        return formatDate1.compareTo(formatDate2);
//                    } catch (ParseException e) {
//                        e.printStackTrace();
//                    }
//                }
//                return 0;
//            }
//        });
//
//        for (int i = 0; i < pointList.size(); i++) {
//            if (pointList.get(i) instanceof String) {
//                System.out.println(pointList.get(i));
//            } else{
//                for (Model.Point list:model.getPoints()) {
//                    System.out.println(list.getExpireDate());
//                }
//            }
//        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        int dateCount = 3;
        try {
            List<Object> sampleList = new ArrayList<Object>();
            Date formatDate1 = sdf.parse("2012/3/21");
            Date formatDate2 = sdf.parse("2017/4/25");
            Date formatDate3 = sdf.parse("2015/1/25");
            Date formatDate4 = sdf.parse("2019/3/12");
            Date formatDate5 = sdf.parse("2016/4/12");
            Date formatDate6 = sdf.parse("2014/8/25");


            sampleList.add("Sample1");
            sampleList.add(formatDate1);
            sampleList.add(formatDate2);
            sampleList.add(formatDate3);
            sampleList.add("Sample2");
            sampleList.add(formatDate4);
            sampleList.add(formatDate5);
            sampleList.add(formatDate6);

            //①Date型ArrayListを宣言
            List<Date> dateList = new ArrayList<Date>();

            //②Object型ArrayListからDate型のみ取り出し①で用意したArrayListに追加
            for (int i = 1; i < 1 + dateCount; i++) {
                if (sampleList.get(i) instanceof Date) {
                    dateList.add((Date) sampleList.get(i));
                }
            }
            //③①のArrayList.sortメソッドで昇順にソート
            dateList.sort(new Comparator<Date>() {
                @Override
                public int compare(Date o1, Date o2) {
                    return o1.compareTo(o2);
                }
            });
            //①Date型ArrayListを宣言
            List<Date> dateList2 = new ArrayList<Date>();
            //②Object型ArrayListからDate型のみ取り出し①で用意したArrayListに追加
            for (int i = 5; i < 5 + dateCount; i++) {
                if (sampleList.get(i) instanceof Date) {
                    dateList2.add((Date) sampleList.get(i));
                }
            }
            //③①のArrayList.sortメソッドで昇順にソート
            dateList2.sort(new Comparator<Date>() {
                @Override
                public int compare(Date o1, Date o2) {
                    return o1.compareTo(o2);
                }
            });

            //④Object型ArrayListのDate型の要素にソート後の①を要素が小さい方から代入し直す
            for (int i = 1; i < 1 + dateCount; i++) {
                if (sampleList.get(i) instanceof Date) {
                    sampleList.set(i, dateList.get(i-1));
                }
            }
            //④Object型ArrayListのDate型の要素にソート後の①を要素が小さい方から代入し直す
            for (int i = 5; i < 5 + dateCount; i++) {
                if (sampleList.get(i) instanceof Date) {
                    sampleList.set(i, dateList2.get(i-5));
                }
            }

            for (Object list : sampleList) {
                System.out.println(list);
            }


        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}

class PointComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Model.Point && o2 instanceof Model.Point) {

            Model.Point point1 = (Model.Point) o1;
            Model.Point point2 = (Model.Point) o2;
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            try {
                Date formatDate1 = sdf.parse(point1.getExpireDate());
                Date formatDate2 = sdf.parse(point2.getExpireDate());
                return formatDate1.compareTo(formatDate2);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return 0;

    }
}
