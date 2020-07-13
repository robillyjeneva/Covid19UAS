package com.jeneva.robilly;

import java.util.ArrayList;

public interface IMainPresenter {
    void downloadData();

    interface View{
        void showProgressBar();
        void hideProgressBar();
        void showError(String error);
        void dataDownloadedSuccessfully(ArrayList<String> datesArrayList, ArrayList<Status> statusArrayList);
    }
}
