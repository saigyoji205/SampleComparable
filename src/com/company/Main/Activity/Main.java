package com.company.Main.Activity;

import com.company.Main.Model.Model;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Model model = new Model();
        Model.Point[] points = {new Model.Point("2017/4/25","Ring"),new Model.Point("2014/3/25","Yang"),new Model.Point("2019/4/22","Oauth"),new Model.Point("2013/4/21","Tine")};
        model.setPoints(points);
        Arrays.sort(points);

        for(Model.Point list:points){
            System.out.println(list.getExpireDate()+":"+list.getName());
        }
    }
}
