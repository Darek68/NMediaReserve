package ru.darek.pusher

import com.google.auth.oauth2.GoogleCredentials
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.messaging.Message
import java.io.FileInputStream


fun main() {
    val options = FirebaseOptions.builder()
        .setCredentials(GoogleCredentials.fromStream(FileInputStream("fcm.json")))
        .build()

    FirebaseApp.initializeApp(options)

  /*  val message = Message.builder()
        .putData("action", "LIKE")
        .putData("content", """{
          "userId": 1,
          "userName": "Dariusz3",
          "postId": 2,
          "postAuthor": "Нетология3"
        }""".trimIndent())
        .setToken("ckGJ8OgzQfKWHAuLCFaeOF:APA91bGBWNfCCUhNzJ84PAkTE92JAJBcyZWY9nS0-Mhbl5Kb3q6DqXXugQg3MBgtz7ZZm8VLgwI_m4P5LfgbQhPtwbaUHqi-Mg7tn_dEGi6l007YL56KG9epdv4aFNjq1z7upEYoK6VZ")
        .build() */
    val message = Message.builder()
        .putData("action", "NEWPOST1")
        .putData("content", """{         
          "postAuthor": "Dariusz",
          "text": "Оооочень болькнкк  иолдиол иолдитолд  толд толд толд толд толд толдз толдж толд толд тол от kobh jivg hucf gc fgycf gycf gvg hbhj bh олир оли рол мипр мпр м"
        }""".trimIndent())
        .setToken("ckGJ8OgzQfKWHAuLCFaeOF:APA91bGBWNfCCUhNzJ84PAkTE92JAJBcyZWY9nS0-Mhbl5Kb3q6DqXXugQg3MBgtz7ZZm8VLgwI_m4P5LfgbQhPtwbaUHqi-Mg7tn_dEGi6l007YL56KG9epdv4aFNjq1z7upEYoK6VZ")
        .build()

    FirebaseMessaging.getInstance().send(message)
}