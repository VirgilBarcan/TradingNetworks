package com.tradingnetworks.dataobjects;

import com.tradingnetworks.api.NewsPaper;

import java.util.ArrayList;

/**
 * Created by catavlas on 11/9/2016.
 */
public class AllPapers {

    private ArrayList<NewsPaper> history;
    private ArrayList<NewsPaper> currentPapers;

    public void registerPaper(NewsPaper newsPaper){

    }

    public void updateAll(String message){

    }


    public ArrayList<NewsPaper> getCurrentPapers() {
        return currentPapers;
    }

    public void setCurrentPapers(ArrayList<NewsPaper> currentPapers) {
        this.currentPapers = currentPapers;
    }

    public ArrayList<NewsPaper> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<NewsPaper> history) {
        this.history = history;
    }
}
