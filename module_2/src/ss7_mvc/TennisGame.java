package ss7_mvc;


public class TennisGame {

    static final String LOVE = "Love";

    static final String FIFTEEN = "Fifteen";
    static final String THIRTY = "Thirty";
    static final String FORTY = "Forty";
    static final String ALL = "_All";

    public static String getScore(int point1, int point2) {
        String core = "";
        int tempScore = 0;
        if (point1 >= 4 || point2 >= 4) {
            return temp(point1, point2);
        } else if (point1 == point2) {
            return tennis(point1);
        } else {
            return tennisS(point1,point2);
        }
    }


    public static String tennisS(int tempScore, int point1) {
        for (int i = 1; true; i++) {
            if (i == 1) {
                tempScore = point1;
            } else {
                return "-";
            }
            switch (tempScore) {
                case 0:
                    return LOVE;

                case 1:
                    return FIFTEEN;

                case 2:
                    return THIRTY;

                case 3:
                    return FORTY;

            }
        }
    }
    public static String tennis ( int point1){

        switch (point1) {
            case 0:
                return LOVE + ALL;
            case 1:
                return FIFTEEN + ALL;

            case 2:
                return THIRTY + ALL;

            case 3:
                return FORTY + ALL;

            default:
                return "Deuce";

        }
    }
    public static String temp ( int point1, int point2){
        int minusResult = point1 - point2;
        if (minusResult == 1) {
            return "Advantage TrucVi";
        } else if (minusResult == -1) {
            return "Advantage TranHong";
        } else if (minusResult >= 2) {
            return "Win for TrucVi";
        } else {
            return "Win for TranHong";
        }

    }
}




