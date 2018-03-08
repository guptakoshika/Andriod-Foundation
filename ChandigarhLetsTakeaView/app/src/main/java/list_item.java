/**
 * Created by Koshika Gupta on 20-02-2018.
 */
package com.example.android.chandigarh_letstakeaview;
public class list_item {
    int  cevent;
    int cdescription;

    public list_item(int  event, int description)
    {
        cevent = event;
        cdescription = description;
    }


    public int getCevent() {
        return cevent;
    }
    public int getDescription() {
        return cdescription;
    }
}
