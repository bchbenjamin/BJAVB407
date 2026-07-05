import os

for curdir, folders, files in os.walk(os.getcwd(), topdown=False):
    for file in files:
        if file.endswith(".class"):
            os.unlink(os.path.join(curdir, file))
            print("Deleted " + os.path.join(curdir, file))