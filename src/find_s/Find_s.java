/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package find_s;

import java.util.Arrays;
import find_s.FindSFrame;

/**
 *
 * @author IrfanS
 */
public class Find_s {

    private String[] hipotesis_yes = new String[]{"", "", "", "", "", "", ""};
    private String[] hipotesis_no = new String[]{"", "", "", "", "", "", ""};

    private String[][] dataTraining = new String[][]{
        {"Sunny", "Warm", "Normal", "Strong", "Warm", "Same", "Yes"},
        {"Sunny", "Warm", "High", "Strong", "Warm", "Same", "Yes"},
        {"Rainy", "Cold", "High", "Strong", "Warm", "Change", "No"},
        {"Sunny", "Warm", "High", "Strong", "Cool", "Change", "Yes"},};
    // TODO code application logic here

    public static void main(String[] args) {
        FindSFrame finds = new FindSFrame();
        finds.setVisible(true);
        
        
    }

    public void run() {
//        for (int i = 0; i < 7; i++) {
//            hipotesis_yes[i] = Find_s[0][i];
//        }
//        System.out.println("\t    ==HIPOTESA AWAL==");
//        System.out.println(Arrays.toString(hipotesis_yesesis));
//        System.out.println("===========================================");
//
//        for (int i = 1; i < 4; i++) {
//            for (int j = 0; j < 6; j++) {
//                if (Find_s[i][6].equalsIgnoreCase("Y")) {
//                    if (Find_s[i][j].equalsIgnoreCase(hipotesis[j])) {
//                        hipotesis[j] = Find_s[i][j];
//                    } else {
//                        hipotesis[j] = "?";
//                    }
//                }
//            }
//            System.out.println(Arrays.toString(Find_s[i]) + "\t=> " + Arrays.toString(hipotesis));
//        }
//        displayJFrame();

        for (int i = 0; i < dataTraining.length; i++) {
            for (int j = 0; j < dataTraining[0].length - 1; j++) {
                if (dataTraining[i][dataTraining[0].length - 1].equalsIgnoreCase("Yes")) {
                    if (hipotesis_yes[j].equalsIgnoreCase("")) {
                        hipotesis_yes[j] = dataTraining[i][j];
                    } else {
                        if (!hipotesis_yes[j].equalsIgnoreCase(dataTraining[i][j])) {
                            hipotesis_yes[j] = "?";
                        }
                    }
                } else {
                    if (hipotesis_no[j].equalsIgnoreCase("")) {
                        hipotesis_no[j] = dataTraining[i][j];
                    } else {
                        if (!hipotesis_no[j].equalsIgnoreCase(dataTraining[i][j])) {
                            hipotesis_no[j] = "?";
                        }
                    }
                }
            }
        }

//        FindSFrame finds = new FindSFrame();
//        finds.setVisible(true);
    }

    public String[] getHipotesis_yes() {
        return hipotesis_yes;
    }

    public String[] getHipotesis_no() {
        return hipotesis_no;
    }
    
    
}
