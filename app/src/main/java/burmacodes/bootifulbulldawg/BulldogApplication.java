package burmacodes.bootifulbulldawg;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by Jason on 9/27/2017.
 */

public class BulldogApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(this);
    }
}
