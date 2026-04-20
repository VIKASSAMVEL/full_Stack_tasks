# Task 20: Branching Strategies & Conflict Resolution

## Branching Strategy
- **main**: Production stable code.
- **feature/name**: Development of new features.

## Commands
1. **Create Branch**: `git checkout -b feature/login`
2. **Merge Branch**: `git checkout main` -> `git merge feature/login`
3. **Rebase**: `git rebase main`

## Handling Merge Conflicts
1. Identify the conflict file (git will mark with `<<<<<<< HEAD`).
2. Edit the file to keep appropriate changes.
3. `git add <file>`
4. `git commit -m "Resolved merge conflict"`
