package com.company.Main.Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 * Created by Hirokazu on 2016/07/17.
 */
public class Model {
    private Point[] points;
    private String labelName;

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public String getLabelName() {
        return labelName;
    }

//    public void setPoints(List<Point> points) {
//        this.points = points;
//    }

//    public List<Point> getPoints() {
//        return points;
//    }

    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }

    public static class Point implements Comparable,Comparator{

        private String expireDate;
        private String name;

        public Point(String expireDate,String name) {
            this.expireDate = expireDate;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setExpireDate(String expireDate) {
            this.expireDate = expireDate;
        }

        public String getExpireDate() {
            return expireDate;
        }

        @Override
        public int compareTo(Object o) {
            Point point = (Point)o;
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            try {
                Date formatDate1 = sdf.parse(point.expireDate);
                Date formatDate2 = sdf.parse(this.expireDate);
                return -(formatDate1.compareTo(formatDate2));
            } catch (ParseException e) {
                e.printStackTrace();
                return 0;
            }
        }

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
}
