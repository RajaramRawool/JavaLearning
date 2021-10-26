package javacourse.codingexercises.flowcodingexercises;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket) {
        double areaOfWall = width * height;
        int additionalBucketCount = 0;
        double areaCanPaint = areaPerBucket * (extraBucket + additionalBucketCount);
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBucket < 0)) {
            return -1;
        } else {
            while (areaOfWall > areaCanPaint) {

                additionalBucketCount++;
                areaCanPaint = areaPerBucket * (extraBucket + additionalBucketCount);
            }
        }
        return additionalBucketCount;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        double areaOfWall = area;
        int additionalBucketCount = 0;
        int extraBucket = 0;
        double areaCanPaint = areaPerBucket * (extraBucket + additionalBucketCount);
        if ((area <= 0) || (areaPerBucket <= 0))  {
            return -1;
        } else {
            while (areaOfWall > areaCanPaint) {

                additionalBucketCount++;
                areaCanPaint = areaPerBucket * (extraBucket + additionalBucketCount);
            }
        }
        return additionalBucketCount;
    }
}