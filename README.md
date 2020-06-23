# MyNewRepository
this is my repository
Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium
$ git init
Initialized empty Git repository in D:/Selenium_files/Jun_Selenium/.git/

Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (master)
$ git status
On branch master

No commits yet

nothing to commit (create/copy files and use "git add" to track)

Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (master)
$ git status
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        .classpath
        .gitignore
        .project
        .settings/
        pom.xml

nothing added to commit but untracked files present (use "git add" to track)

Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (master)
$ git add.
git add .

git: 'add.' is not a git command. See 'git --help'.

The most similar command is
        add

Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (master)
$ git add .
warning: LF will be replaced by CRLF in .gitignore.
The file will have its original line endings in your working directory

Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (master)
$

Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (master)
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   .classpath
        new file:   .gitignore
        new file:   .project
        new file:   .settings/org.eclipse.jdt.core.prefs
        new file:   .settings/org.eclipse.m2e.core.prefs
        new file:   pom.xml


Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (master)
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   .classpath
        new file:   .gitignore
        new file:   .project
        new file:   .settings/org.eclipse.jdt.core.prefs
        new file:   .settings/org.eclipse.m2e.core.prefs
        new file:   pom.xml

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        src/


Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (master)
$ cd src

Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium/src (master)
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   ../.classpath
        new file:   ../.gitignore
        new file:   ../.project
        new file:   ../.settings/org.eclipse.jdt.core.prefs
        new file:   ../.settings/org.eclipse.m2e.core.prefs
        new file:   ../pom.xml

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        ./


Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium/src (master)
$ cd ..

Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (master)
$ git add .

Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (master)
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   .classpath
        new file:   .gitignore
        new file:   .project
        new file:   .settings/org.eclipse.jdt.core.prefs
        new file:   .settings/org.eclipse.m2e.core.prefs
        new file:   pom.xml
        new file:   src/main/java/june_selenium/Demo.java


Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (master)
$ git commit -m "Demo.java"

*** Please tell me who you are.

Run

  git config --global user.email "you@example.com"
  git config --global user.name "Your Name"

to set your account's default identity.
Omit --global to set the identity only in this repository.

fatal: unable to auto-detect email address (got 'Shweta@LAPTOP-GT856BRE.(none)')

Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (master)
$ ^C


Run

  git config --global user.email "you@example.com"
  git config --global user.name "Your Name"

to set your account's default identity.
Omit --global to set the identity only in this repository.

fatal: unable to auto-detect email address (got 'Shweta@LAPTOP-GT856BRE.(none)')

Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (master)
$ git commit -m "Demo.java"
[master (root-commit) 1a906f8] Demo.java
 7 files changed, 86 insertions(+)
 create mode 100644 .classpath
 create mode 100644 .gitignore
 create mode 100644 .project
 create mode 100644 .settings/org.eclipse.jdt.core.prefs
 create mode 100644 .settings/org.eclipse.m2e.core.prefs
 create mode 100644 pom.xml
 create mode 100644 src/main/java/june_selenium/Demo.java

Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (master)
$ git push origin head
fatal: 'origin' does not appear to be a git repository
fatal: Could not read from remote repository.

Please make sure you have the correct access rights
and the repository exists.

Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (master)
$ git remote add origin https://github.com/ShwetMe/MyNewRepository.git

Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (master)
$ git push origin head


Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (master)
$

Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (master)
$ git push -u origin master
Enumerating objects: 14, done.
Counting objects: 100% (14/14), done.
Delta compression using up to 4 threads
Compressing objects: 100% (9/9), done.
Writing objects: 100% (14/14), 1.73 KiB | 253.00 KiB/s, done.
Total 14 (delta 0), reused 0 (delta 0), pack-reused 0
To https://github.com/ShwetMe/MyNewRepository.git
 * [new branch]      master -> master
Branch 'master' set up to track remote branch 'master' from 'origin'.

Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (master)
$ git checkout -b featurebranch
Switched to a new branch 'featurebranch'

Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (featurebranch)
$ git branch
* featurebranch
  master

Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (featurebranch)
$ git checkout master
Switched to branch 'master'
Your branch is up to date with 'origin/master'.

Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (master)
$ git checkout featurebranch
Switched to branch 'featurebranch'

Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (featurebranch)
$ git status
On branch featurebranch
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   src/main/java/june_selenium/Demo.java

no changes added to commit (use "git add" and/or "git commit -a")

Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (featurebranch)
$ git add .

Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (featurebranch)
$ git status
On branch featurebranch
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        modified:   src/main/java/june_selenium/Demo.java


Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (featurebranch)
$ git commit -m "Printing hello worlld in Demo.java"
[featurebranch c79f3fb] Printing hello worlld in Demo.java
 1 file changed, 1 insertion(+), 1 deletion(-)

Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (featurebranch)
$ git push origin head
Enumerating objects: 13, done.
Counting objects: 100% (13/13), done.
Delta compression using up to 4 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (7/7), 524 bytes | 131.00 KiB/s, done.
Total 7 (delta 2), reused 0 (delta 0), pack-reused 0
remote: Resolving deltas: 100% (2/2), completed with 2 local objects.
remote:
remote: Create a pull request for 'featurebranch' on GitHub by visiting:
remote:      https://github.com/ShwetMe/MyNewRepository/pull/new/featurebranch
remote:
To https://github.com/ShwetMe/MyNewRepository.git
 * [new branch]      head -> featurebranch

Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (featurebranch)
$ ^C

Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (featurebranch)
$ git checkout master
Switched to branch 'master'
Your branch is up to date with 'origin/master'.

Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (master)
$ git pull master
fatal: 'master' does not appear to be a git repository
fatal: Could not read from remote repository.

Please make sure you have the correct access rights
and the repository exists.

Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (master)
$ git pull origin master
remote: Enumerating objects: 22, done.
remote: Counting objects: 100% (21/21), done.
remote: Compressing objects: 100% (5/5), done.
remote: Total 10 (delta 2), reused 8 (delta 2), pack-reused 0
Unpacking objects: 100% (10/10), 1.85 KiB | 4.00 KiB/s, done.
From https://github.com/ShwetMe/MyNewRepository
 * branch            master     -> FETCH_HEAD
   1a906f8..05cbdc4  master     -> origin/master
Updating 1a906f8..05cbdc4
Fast-forward
 .classpath                             | 10 ----------
 src/main/java/june_selenium/Demo.java  |  2 +-
 src/main/java/june_selenium/Demo2.java | 10 ++++++++++
 3 files changed, 11 insertions(+), 11 deletions(-)
 create mode 100644 src/main/java/june_selenium/Demo2.java

Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (master)
$ git checkout featurebranch
Switched to branch 'featurebranch'

Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (featurebranch)
$ git pull origin master
From https://github.com/ShwetMe/MyNewRepository
 * branch            master     -> FETCH_HEAD
Updating c79f3fb..05cbdc4
Fast-forward
 .classpath                             | 10 ----------
 src/main/java/june_selenium/Demo2.java | 10 ++++++++++
 2 files changed, 10 insertions(+), 10 deletions(-)
 create mode 100644 src/main/java/june_selenium/Demo2.java

Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (featurebranch)
$ git pull origin master
\From https://github.com/ShwetMe/MyNewRepository
 * branch            master     -> FETCH_HEAD
Already up to date.

Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (featurebranch)
$ git commit -m "Demo.java"^C

Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (featurebranch)
$ ^C

Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (featurebranch)
$ ^C

Shweta@LAPTOP-GT856BRE MINGW64 /d/Selenium_files/Jun_Selenium (featurebranch)
$
