package infa;

public class CaseCond {
    public static void main(String[] args) {
        String RequestLabId = "5";
        String resultEnum = "3";
        String report_type_id = null;
        if (resultEnum != null) {
            if (RequestLabId.equals("5")) {
                switch (resultEnum) {
                    case "0":
                        report_type_id = "8";
                        break;
                    case "3":
                        report_type_id = "1";
                        break;
                    case "6":
                        report_type_id = "2";
                        break;
                    case "2":
                        report_type_id = "3";
                        break;
                    case "5":
                        report_type_id = "4";
                        break;
                    case "1":
                        report_type_id = "5";
                        break;
                    case "4":
                        report_type_id = "6";
                        break;
                    case "7":
                        report_type_id = "9";
                        break;
                    case "8":
                        report_type_id = "10";
                        break;
                    default:
                        report_type_id = "-1";
                        break;
                }
            } else {
                report_type_id = "3";
            }
        } else {
            if (RequestLabId.equals("5")) {
                report_type_id = "-1";
            } else {
                report_type_id = "3";
            }
        }
        System.out.println(report_type_id);
    }
}
