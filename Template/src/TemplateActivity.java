public abstract class TemplateActivity extends Activity {
    @Override
    void onCreate() {
        initUI();
        fetchData();
        setUI();
    }

    @Override
    void onStart() {

    }

    @Override
    void onResume() {

    }

    @Override
    void onPause() {

    }

    @Override
    void onStop() {

    }

    @Override
    void onDestroy() {

    }

    abstract void initUI();

    abstract void fetchData();

    abstract void setUI();
}
