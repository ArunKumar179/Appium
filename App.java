package com.arun.appium_test;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class App {
    public static void main(String[] args) throws Exception {
        DesiredCapabilities g = new DesiredCapabilities();

        g.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        g.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        g.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        g.setCapability(MobileCapabilityType.PLATFORM_VERSION, "16.0"); // update as per your emulator/device
        g.setCapability(MobileCapabilityType.APP, "D:\\ESD\\ApiDemos-debug.apk"); // provide correct path

        URL u = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver driver = new AndroidDriver(u, g);

        System.out.println("App launched successfully!");
    }
}
