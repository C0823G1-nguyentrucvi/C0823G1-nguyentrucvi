package ss7_mvc;


public class TennisGame {


    public static String getScore( int point1, int point2) {
        final String LOVE = "Love";
        final String Fifteen="Fifteen";
        final String Thirty="Thirty";
        final String Forty="Forty";
        final String All="_All";

        String score="";
        int tempScore;
        if (point1 == point2) {
            switch (point1) {
                case 0:
                    score = LOVE+All;
                    break;
                case 1:
                    score =Fifteen+All ;
                    break;
                case 2:
                    score = Thirty+All;
                    break;
                case 3:
                    score = Forty+All;
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else if (point1 >= 4 || point2 >= 4) {
            int minusResult = point1 - point2;
            if (minusResult == 1) {
                score = "Advantage TrucVi";
            } else if (minusResult == -1) {
                score = "Advantage TranHong";
            } else if (minusResult >= 2) {
                score = "Win for TrucVi";
            } else {
                score = "Win for TranHong";
            }
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = point1;
                else {
                    score = "-";
                    tempScore = point2;
                }
                switch (tempScore) {
                    case 0:
                        score =LOVE;
                        break;
                    case 1:
                        score = Fifteen;
                        break;
                    case 2:
                        score = Thirty;
                        break;
                    case 3:
                        score = Forty;
                        break;
                }
            }
        }
        return score;
    }


}
