import { initializeApp } from "https://www.gstatic.com/firebasejs/10.12.2/firebase-app.js";

import { getFirestore } from "https://www.gstatic.com/firebasejs/10.12.2/firebase-firestore.js";

const firebaseConfig = {
    apiKey: "AIzaSyCLIIBk4nE-vr7TXAnvTkhs9yrInggNa7Y",
    authDomain: "school-app-d0f94.firebaseapp.com",
    projectId: "school-app-d0f94",
    storageBucket: "school-app-d0f94.firebasestorage.app",
    messagingSenderId: "304035462797",
    appId: "1:304035462797:web:67f3090173ecea3fdc2cc4",
    measurementId: "G-SBN6CC1JM4"
};

const app = initializeApp(firebaseConfig);

const db = getFirestore(app);

export { db };
