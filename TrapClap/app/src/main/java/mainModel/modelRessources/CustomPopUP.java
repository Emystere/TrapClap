package mainModel.modelRessources;

import android.app.Activity;
import android.app.Dialog;
import android.widget.Button;
import android.widget.TextView;

import pack.clap.R;

public class CustomPopUP extends Dialog {

    private String title,subtitle;
    private Button returnButton;
    TextView titleView, subTitleView;

    public CustomPopUP(Activity activity){
        super(activity, R.style.Theme_AppCompat_DayNight_Dialog_Alert);
        setContentView(R.layout.custom_popup_template);
        this.title="Mon titre";
        this.subtitle="Mon sous titre";
        this.returnButton=findViewById(R.id.return_button);
        this.titleView=findViewById(R.id.title);
        this.subTitleView=findViewById(R.id.subtitle);



    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
    public Button getReturnButton(){
        return returnButton;
    }

    public void build() {

        titleView.setText(this.title);
        subTitleView.setText(this.subtitle);
        show();


    }

}
