# Mastering Encapsulation in Java

A progressive exercise teaching encapsulation through a café ordering system storyline.

## Learning Objective

Master encapsulation fundamentals: private fields, getters/setters, validation, and computed properties.

**Target Audience:** Programmers with basic Java knowledge  
**Estimated Time:** 45-60 minutes

## Quick Start

1. **Start here:** Run `Mission0_TheProblem.java` to see why encapsulation matters
2. **Complete missions in order:** Mission 0 → 1 → 2 → 3
3. **Get help when stuck:** Run `HintSystem.java` for progressive hints
4. **Check your work:** Compare with solution files after attempting each mission

```bash
# Run a mission
cd exercises
javac Mission1_BasicEncapsulation.java
java Mission1_BasicEncapsulation

# Access hints
cd hints
java HintSystem
```

## File Structure

```
Mercury-Engineering-Training-Internship-Exercise/
├── exercises/                    # Mission files (work here)
├── hints/HintSystem.java   # Interactive tiered hints and solutions accessed via console output
└── README.md              # Exercise brief
```

## What You'll Learn

- Why direct field access is problematic
- Using private fields with public getters/setters
- Validation to prevent invalid data
- Computed properties that calculate values
- Best practices (DRY principle, validation in one place)

## Note on Testing

⚠️ **Automated test suite not implemented due to time constraints.** Verify your work by:
- Running each mission's `main()` method
- Checking console output matches expected behavior
- Comparing with solution files

For production use, JUnit tests should be added for automated verification.

## Tips

- Try solving before looking at hints
- Run code frequently to test your changes
- Look for easter eggs throughout for funsies! 🥚

---

**Ready?** Start with `Mission0_TheProblem.java` and save the café!
