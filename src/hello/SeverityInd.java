package hello;

public class SeverityInd {
    public static void main(String args[]) {
        String f2 = "H";
        String rv = "result varchar";
        String rt = "result text";
        String rs = "+ * (#DEF";
        int typeId = 2;
        int si;
        int re = 0;
        int rn = 0;
        int rst;
        int labId = 4;

        if (typeId == 8 && labId == 8) {
            rst = 2;
        } else if (typeId == 3 | typeId == 5) {
            rst = 3;
        } else if (typeId == 6 | typeId == 7) {
            rst = typeId;
        } else {
            if (String.valueOf(rn) != null) {
                rst = 1;
            } else if (String.valueOf(re) != null) {
                rst = 2;
            } else if (rv != null) {
                rst = 3;
            } else if (rt != null) {
                rst = 5;
            } else {
                rst = 0;
            }
        }
        System.out.println("result_type_id is"+rst);

        if (labId == 5) {
            si = 0;
        } else {
            if (typeId == 1) {
                if (f2.equals("H")) {
                    si = 1;
                } else if (f2.equals("L")) {
                    si = 2;
                } else {
                    si = 0;
                }
            } else if (typeId == 2) {
                if (rs.toUpperCase().contains("POS") | (rs.toUpperCase().contains("DETECT") &&
                        !rs.toUpperCase().contains("NOT DETECT")) | rs.toUpperCase().contains("+")) {
                    si = 3;
                } else {
                    si = 0;
                }
            } else {
                si = 0;
            }
        }
        System.out.println("severity_ind is "+si);
    }
}
