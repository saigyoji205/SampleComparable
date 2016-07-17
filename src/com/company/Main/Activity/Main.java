package com.company.Main.Activity;

import com.company.Main.Model.Model;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Model model = new Model();
        ArrayList<Model.Point[]> pointList = new ArrayList<>();
        Model.Point[] points = {new Model.Point("2017/4/25","Ring"),new Model.Point("2014/3/25","Yang"),new Model.Point("2019/4/22","Oauth"),new Model.Point("2013/4/21","Tine")};
        model.setPoints(points);
        pointList.add(points);
        Arrays.sort(points);
        Model.Point[] points2 = {new Model.Point("2012/4/25","Honoka"),new Model.Point("2019/3/25","Umi"),new Model.Point("2020/4/22","Chika"),new Model.Point("2016/4/21","Eli")};
        model.setPoints(points2);
        pointList.add(points2);
        Arrays.sort(points2);

        for(int i = 0; i < pointList.size(); i++){
            for(int j = 0 ; j < pointList.get(i).length; j++) {
                System.out.println(pointList.get(i)[j].getExpireDate()+":"+pointList.get(i)[j].getName());
            }
            System.out.println("-----------");
        }
    }
}
