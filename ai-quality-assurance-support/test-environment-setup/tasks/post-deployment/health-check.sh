#!/bin/bash

# Use the first command line argument as the base path
basePath="$1"

function list_files() {
  if [ -d $1 ]
  then
    for file in $1/*
    do
      if [ -d $file ]
      then
        list_files $file
      elif [ -f $file ]
      then
        # Print file details
        echo "Directory: $(dirname $file)"
        echo "File: $(basename $file)"
        echo "Size: $(du -sh $file | cut -f1)"
        
        echo "--------------------------------------"
      fi
    done
  else
    echo "$1 is not a directory. Please provide a valid directory path."
  fi
}

# Check if argument was provided
if [ -z "$basePath" ]
then
  echo "No directory provided. Please add a directory as an argument."
  exit 1
fi

# If argument was provided then proceed to list files
list_files $basePath