package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Music {

    private String[] playList;
    String sk;
    String sq;
    ArrayList<String> thePlayList;

    public Music(String[] playList){
        thePlayList = new ArrayList<String>(Arrays.asList(playList));
    }

    public Integer selection(Integer startIndex, String selection){
        ArrayList<String> tempList = new ArrayList<String>(); //creating an arraylist with 3 duplicates to check front and back.
        tempList.addAll(thePlayList);
        tempList.addAll(thePlayList);
        tempList.addAll(thePlayList);
        Integer countBack = 0;
        Integer countFront = 0;

        for(int i = startIndex+thePlayList.size(); i<tempList.size();i++){
            if(tempList.get(i) == selection){
                break;
            }
            countBack++;
        }

        for(int i = startIndex+thePlayList.size(); i>0;i--){

            if(tempList.get(i) == selection){
                break;
            }
            countFront++;
        }

        return Math.min(countBack,countFront);
    }
}
