#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_phc_opencv_1demo_1fuck_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "fucking the openvc";
    return env->NewStringUTF(hello.c_str());
}