//package com.example.studybuddies.notifications;
//
//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.auth.FirebaseUser;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.iid.FirebaseInstanceId;
////import com.google.firebase.iid.FirebaseInstanceIdService;
//import com.google.firebase.messaging.FirebaseMessagingService;
//import com.google.firebase.messaging.RemoteMessage;
//
//
///*
//public class FirebaseService extends FirebaseInstanceIdService {
//
//    @Override
//    public void onTokenRefresh() {
//        super.onTokenRefresh();
//        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
//        String tokenRefresh = FirebaseInstanceId.getInstance().getToken();
//        if (user != null) {
//            updateToken(tokenRefresh);
//        }
//    }
//
//    private void updateToken(String tokenRefresh) {
//        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
//        DatabaseReference ref = FirebaseDatabase.getInstance().getReference("Tokens");
//        Token token = new Token(tokenRefresh);
//        ref.child(user.getUid()).setValue(token);
//    }
//}
//*/
//
//public class FirebaseService extends FirebaseMessagingService {
//    @Override
//    public void onNewToken(String s) {
//        super.onNewToken(s);
//        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
//        String newToken = FirebaseInstanceId.getInstance().getToken();
//        if (user != null) {
//            updateToken(newToken);
//        }
//    }
//
//
//    private void updateToken(String tokenRefresh) {
//        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
//        DatabaseReference ref = FirebaseDatabase.getInstance().getReference("Tokens");
//        Token token = new Token(tokenRefresh);
//        ref.child(user.getUid()).setValue(token);
//    }
//}