package wyf.sj;

import android.app.Activity;
import android.os.Bundle;

public class MyActivity extends Activity {
    private MySurfaceView mGLSurfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);
        mGLSurfaceView = (MySurfaceView) findViewById(R.id.view);
        // mGLSurfaceView = new MySurfaceView(this);
        mGLSurfaceView.requestFocus();// ��ȡ����
        mGLSurfaceView.setFocusableInTouchMode(true);// ����Ϊ�ɴ���
    }

    @Override
    protected void onResume() {
        super.onResume();
        mGLSurfaceView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mGLSurfaceView.onPause();
    }
}