package com.alhas;

public class GetBucketCount {

    public static int getBucketCount(double width, double height,
                                     double areaPerBucket, int extraBuckets) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else {
            double total = (width * height) / areaPerBucket - extraBuckets;
            int i = (int) Math.ceil(total);
            System.out.println(i);
            return i;
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {

            double total = (width * height) / areaPerBucket;
            int i = (int) Math.ceil(total);
            System.out.println(i);
            return i;
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {

        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double total = area / areaPerBucket;
            int i = (int) Math.ceil((total));
            System.out.println(i);
            return i;
        }

    }
}


