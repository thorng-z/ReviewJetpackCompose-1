# ComposeReview — Class A5 Jetpack Compose review (student starter)

Seven exercises, one per lesson. Open the project, sync Gradle once, run it.

## Running an exercise

`MainActivity.kt` has one line inside `setContent`. Change it to the exercise
you are working on; the full list is in the comment above the class. It ships
set to `lesson01.TogglePractice()`.

```
common/       Expense.kt (data model), CommonUi.kt (the finished ExpenseRow)
lesson01/     TogglePractice, BrokenToggle          thinking in state
lesson02/     ExpenseRowPractice, ThreeAcrossPractice   layout & Modifier
lesson03/     ExpenseListPractice                    LazyColumn
lesson04/     ExpenseScreenPractice                  Scaffold & Material 3
lesson05/     CounterPractice                        remember
lesson06/     SignUpFormPractice                     rememberSaveable
lesson07/     ExpenseScreenWithViewModel             ViewModel & uiState
```

Every practice file is broken or unfinished **on purpose**. Read the comment at
the top of the file before you change anything — it tells you what to fix and
how to check your own work.

## Before lessons 6 and 7

Turn on auto-rotate in your emulator (Settings → Display → Auto-rotate screen)
and rotate once to be sure it really turns. Without it you cannot test either
exercise.

## Lessons 3 and 5 live in Logcat

Open Logcat and filter by tag `LESSON03` (lesson 3) or `LESSON05` (lesson 5).
Those two exercises look identical on screen whether you got them right or not
— the log is where the answer shows up.

## If Gradle complains

Everything the exercises need is already configured: `kotlin-parcelize`
(lesson 6), `lifecycle-viewmodel-compose` (lesson 7) and
`material-icons-extended` (the lesson 4 FAB icon). Do not change
`gradle/libs.versions.toml` — in particular Kotlin must stay at 2.4.10 or
newer, or lesson 6 will not compile.

## Submitting your work

You work on your own branch and hand it in by pushing that branch. Nobody
touches anybody else's branch, and nobody touches `main`.

**1. Make your branch.** Name it after yourself: full name, lowercase, words
joined by hyphens. `Chea Reaksa` becomes `chea-reaksa`.

```bash
git checkout -b chea-reaksa
```

Check you are on it before you start typing:

```bash
git branch --show-current
```

**2. Commit as you go.** One commit per lesson is a good rhythm — don't save
everything for the last minute.

```bash
git add -A
git commit -m "Lesson 3: LazyColumn with key"
```

**3. Push to hand in.** The first push needs `-u`, after that `git push` is
enough.

```bash
git push -u origin chea-reaksa
```

You can push again as many times as you like before the deadline. Each push
updates your submission — the last one before the deadline is the one marked.

### Rules

- **Never push to `main`.** It is the clean starter every classmate clones. If
  you commit your work onto `main` by accident, tell your teacher instead of
  trying to undo it yourself.
- **One branch per student**, named after you. Do not commit on a classmate's
  branch.
- Your branch is public, like the rest of this repository. Anyone can read it.

### If push is refused

`remote: Permission to ... denied` means your GitHub account is not on the
repository yet. Check your email for the collaborator invitation and accept it,
then push again. If there is no invitation, tell your teacher — and make sure
the GitHub username you wrote on the class sheet is spelled exactly right.
