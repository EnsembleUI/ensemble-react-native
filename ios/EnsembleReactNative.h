
#ifdef RCT_NEW_ARCH_ENABLED
#import "RNEnsembleReactNativeSpec.h"

@interface EnsembleReactNative : NSObject <NativeEnsembleReactNativeSpec>
#else
#import <React/RCTBridgeModule.h>

@interface EnsembleReactNative : NSObject <RCTBridgeModule>
#endif

@end
