highcardseries/
│
├── pom.xml
├── README.md
│
├── docs/
│ ├── DesignAndDevelopment.pdf
│ ├── TestingDocument.pdf
│ ├── screenshots/
│ └── diagrams/
│
├── video/
│ └── demo.mp4
│
├── src/
│ │
│ ├── main/
│ │ └── java/
│ │ └── com/
│ │ └── highcard/
│ │
│ │ ├── Main.java
│ │ │
│ │ ├── enums/
│ │ │ ├── Rank.java
│ │ │ └── Suit.java
│ │ │
│ │ ├── models/
│ │ │ ├── Card.java
│ │ │ ├── Deck.java
│ │ │ ├── Player.java
│ │ │ ├── Round.java
│ │ │ └── Game.java
│ │ │
│ │ ├── services/
│ │ │ ├── GameService.java
│ │ │ ├── RoundService.java
│ │ │ ├── DeckService.java
│ │ │ ├── ScoreService.java
│ │ │ ├── BonusService.java
│ │ │ ├── AdjustmentService.java
│ │ │ └── ComputerPlayerService.java
│ │ │
│ │ ├── utils/
│ │ │ ├── InputValidator.java
│ │ │ ├── ConsoleFormatter.java
│ │ │ ├── CardComparator.java
│ │ │ ├── RankSequenceHelper.java
│ │ │ └── SuitCounterHelper.java
│ │ │
│ │ ├── interfaces/
│ │ │ ├── BonusCalculator.java
│ │ │ └── Shuffleable.java
│ │ │
│ │ ├── exceptions/
│ │ │ ├── InvalidInputException.java
│ │ │ ├── EmptyDeckException.java
│ │ │ └── InvalidCardException.java
│ │ │
│ │ └── constants/
│ │ └── GameConstants.java
│ │
│ └── test/
│ └── java/
│ └── com/
│ └── highcard/
│
│ ├── CardTest.java
│ ├── DeckTest.java
│ ├── PlayerTest.java
│ ├── RoundServiceTest.java
│ ├── BonusServiceTest.java
│ ├── AdjustmentServiceTest.java
│ └── GameServiceTest.java
│
└── target/
