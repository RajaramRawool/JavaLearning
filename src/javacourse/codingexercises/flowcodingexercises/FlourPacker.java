package javacourse.codingexercises.flowcodingexercises;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int kgInBigBags = 0;
        int totalKgCanPack = 0;
        int bigBagCount = 0;
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        } else {

            for (int i = 0; i <= bigCount ; i++) {
                if (kgInBigBags < goal) {
                    kgInBigBags = i * 5;
                    if (kgInBigBags == goal) {
                        bigBagCount = i;
                        return true;
                    }else if (kgInBigBags > goal) {
                        kgInBigBags -= 5;
                        break;
                    }
                }
            }
            for (int i = 1; i <= smallCount; i++ ) {
                if ((kgInBigBags + i) == goal ) {
                    return true;
                }else {
                    totalKgCanPack = kgInBigBags + i;
                }
            }
        }
        if (totalKgCanPack == goal) {
            return true;
        } else {
            return false;
        }
    }
}
