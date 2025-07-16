🎓 Student Info Tracker
Student Info Tracker is a fun and hands-on Java project that lets you add, search, and delete student records using Hibernate and MySQL — all through a clean and interactive console interface.


🌟 Project Highlights
✅ Built using Hibernate ORM for seamless Java–MySQL integration
✅ Simple console interface with options to add, search, and delete student records
✅ Uses LocalDate to store year of joining
✅ Demonstrates real-world database operations with Hibernate Session methods


## 🛠️ Tech Stack

| Component   | Technology Used             |
|------------|------------------------------|
| Language    | Java 17                      |
| ORM         | Hibernate 5.4.33.Final       |
| Database    | MySQL 8.x                    |
| Date API    | Java LocalDate (Java Time API) |
| IDE         | Eclipse                      |
| Config      | `hibernate.cfg.xml` (XML-based)


🏗️ Project Architecture (Non-Maven – JAR-based)
Student_Info_Tracker/
│
├── lib/ # 📦 All external JAR files placed here
│ ├── hibernate-core-5.4.33.Final.jar
│ ├── mysql-connector-java-x.x.x.jar
│ └── other Hibernate dependencies
│
├── src/
│ └── com/
│ └── tka/
│ ├── Student.java # 📄 Entity class with annotations
│ └── Management.java # 🚀 Main class (console UI + DB logic)
│
├── hibernate.cfg.xml # 🛠️ Hibernate DB config file
├── .gitignore # 🙈 Git ignored files
└── README.md # 📝 Project documentation


. 📦 How to Download & Run
1. Download the ZIP file or clone the repo
2. Open it in Eclipse
3. Add JAR files in the `/lib/` folder to your build path
4. Configure your MySQL DB in `hibernate.cfg.xml`
5. Run `Management.java` and follow the menu!

👨‍💻 Author
Tanushka Chavan
📧 [tanushkachavan99@gmail.com](mailto:tanushkachavan99@gmail.com)  
📧 [tanushkachavan2023.comp@mmcoe.edu.in](mailto:tanushkachavan2023.comp@mmcoe.edu.in)  
🌐 GitHub: [Tanushka-Chavan](https://github.com/Tanushka-Chavan)



