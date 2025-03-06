# Advanced Structural Patterns: Singleton & Adapter

This project implements two structural design patterns: Singleton and Adapter.  
- **Singleton**: A global configuration manager that ensures a single instance.  
- **Adapter**: A wrapper for a legacy chat service to match a new interface.  


---

## 🏗️ **Implementation Details**

### **1️⃣ Singleton: Global Configuration Manager**
**Intent:** Ensure only one instance of the configuration manager exists.  

#### ✅ **Features:**
- **Lazy initialization**: The instance is created only when first needed.  
- **Stores configurations** as key-value pairs.  
- **Methods**: `getConfig(String key)`, `printAllConfigs()`.  

#### 🚀 **How to Run**
Run `ConfigManagerDemo.java`:
Max Players: 100

All Configurations:
maxPlayers → 100
defaultLanguage → en
gameDifficulty → medium

2️⃣ Adapter: Chat Service Integration

Intent: Adapt a legacy chat system to a new expected interface.

✅ Features:

LegacyChatService: The old chat system with sendLegacyMessage().
ChatService: The new interface with sendMessage().
ChatServiceAdapter: Bridges the gap between old and new.

#### 🚀 **How to Run**

Run ChatAdapterDemo.java:
``Legacy Chat: Hello world!

📌 **Key Takeaways**

The Singleton pattern ensures only one instance of a class exists.
The Adapter pattern helps integrate incompatible interfaces.
The project follows SOLID principles (Single Responsibility & Dependency Inversion).
