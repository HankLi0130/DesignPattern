public class TemplateTest {

    public static void main(String[] args) {
        Activity activity = new LoginActivity();

        activity.onCreate();
        activity.onStart();
        activity.onResume();
        activity.onPause();
        activity.onStop();
        activity.onDestroy();
    }

}
