package com.ensemblereactnative;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.Promise;

abstract class EnsembleReactNativeSpec extends ReactContextBaseJavaModule {
  EnsembleReactNativeSpec(ReactApplicationContext context) {
    super(context);
  }

  public abstract void multiply(double a, double b, Promise promise);
  public abstract void openEnsembleApp(Promise promise);

}
