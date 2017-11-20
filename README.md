# SpringTut

Used [this](https://spring.io/guides/gs/rest-service/#scratch) tutorial for trying out the [UNTITLED] workflow by hand.

## What I did
1. For each step, I followed the instructions and commited the changes
2. Then I wrote the documentation using asciidoc in /docs/[STEP\_NUM]/main.adoc
3. Recorded the SHAs of the relevant commits in /docs/[STEP\_NUM]/SHAs

## To checkout a "step"
```sh 
# Creates a detached head with no parent history
git checkout --orphan master.[STEP\_NUM]

# removes all files giving fresh start
git rm -rf

# Using the SHA files as reference, cherry pick all commits in order
git cherry-pick 4142c62
git cherry-pick d4b78ea
...
```

## Reference
See [the design document](https://docs.google.com/document/d/1qmkQzpdWPP9n91PAc9Cg7Z6F534QkQ-poqU2cCqXDH8) for more info.
