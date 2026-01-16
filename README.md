# OOP Group Project P6-7

A LibGDX-based game engine skeleton for the OOP module project.

## Project Structure

```
lwjgl3/src/main/java/com/team/project/
├── engine/                       # Generic Engine (Reusable)
│   ├── main/
│   │   └── BaseEngine.java       # Main Game class
│   ├── managers/
│   │   ├── SceneManager.java     # Screen transitions
│   │   ├── EntityManager.java    # Entity management
│   │   ├── CollisionManager.java # Collision detection
│   │   └── IOManager.java        # Rendering wrapper
│   ├── entities/
│   │   ├── BaseEntity.java       # Parent class
│   │   └── CollidableEntity.java # Collidable entity
│   └── components/
│       ├── Transform.java        # Position data
│       └── SpriteData.java       # Texture info
│
├── simulation/                   # Demo Implementation
│   ├── states/
│   │   └── SimulationScreen.java # Main game screen
│   └── objects/
│       ├── DemoPlayer.java       # WASD player
│       ├── DemoEnemy.java        # Chase AI
│       └── DemoWall.java         # Static obstacle
│
└── lwjgl3/                       # Desktop Launcher
    ├── Lwjgl3Launcher.java       # Entry point
    └── StartupHelper.java        # macOS support
```

## How to Run

1. Open in Eclipse/IntelliJ as a Gradle project
2. Run `lwjgl3` module -> `Lwjgl3Launcher.java`

## Assets

Place images and sounds in: `lwjgl3/src/main/resources/`

## Team

- Add your team members here
