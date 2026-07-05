"""This python script compiles all the java programs here
This is NOT a mandatory requirement"""
import os, subprocess

for curdir, folders, files in os.walk(os.getcwd(), topdown=False):
    for file in [
        java_file 
        for java_file in files 
        if java_file.endswith(".java")
    ]:
        subprocess.check_call(["javac",os.path.join(curdir, file)])
        print("Complied " + os.path.join(curdir, file))