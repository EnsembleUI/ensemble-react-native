package com.ensemblereactnative;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.module.annotations.ReactModule;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.dart.DartExecutor;
import android.app.Activity;

public class EnsembleReactNativeModule extends EnsembleReactNativeSpec {
  public static final String NAME = "EnsembleReactNative";
  private final ReactApplicationContext reactContext;
  public FlutterEngine flutterEngine;

  EnsembleReactNativeModule(ReactApplicationContext context) {
    super(context);
    this.reactContext = context;
    new Thread(new Runnable() {
      @Override
      public void run() {
        try {
            //dummy delay
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Update ui on UI thread
        reactContext.getCurrentActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                  // Instantiate a FlutterEngine.
                flutterEngine = new FlutterEngine(reactContext.getApplicationContext());

              // Start executing Dart code to pre-warm the FlutterEngine.
              flutterEngine.getDartExecutor().executeDartEntrypoint(
                DartExecutor.DartEntrypoint.createDefault()
              );

              // Cache the FlutterEngine to be used by FlutterActivity.
              FlutterEngineCache
                .getInstance()
                .put(NAME, flutterEngine);
            }
        });

      }
    }).start();
  }

  @Override
  @NonNull
  public String getName() {
    return NAME;
  }


  @ReactMethod
  public void multiply(double a, double b, Promise promise) {
    promise.resolve(a * b);
  }

  @ReactMethod
  public void openEnsembleApp(Promise promise) {
    Activity currentActivity = reactContext.getCurrentActivity();
   
    currentActivity.startActivity(
      FlutterActivity
        .withCachedEngine(NAME)
        .build(currentActivity)
      );
  }
}
