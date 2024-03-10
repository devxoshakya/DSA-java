echo "Enter the commit message: "
read commit_message

# Add all changes to the staging area
git add .

# Commit the changes with the provided commit message
git commit -m "$commit_message"

# Push the changes to the remote repository
git push