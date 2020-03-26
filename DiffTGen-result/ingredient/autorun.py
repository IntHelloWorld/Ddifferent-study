import os

DiffTGen_dir = "/home/hewitt/work/DiffTGen-master"
ingredient_dir = "/home/whj/dowork/ingredient/"
work_path = os.getcwd()+'/'
print("work_path: "+work_path)

#递归查找文件夹下面所有文件
def findAllfile(path, allfile):
    filelist =  os.listdir(path)  
    for filename in filelist:  
        filepath = os.path.join(path, filename)  
        if os.path.isdir(filepath):
            #print(filepath)  
            findAllfile(filepath, allfile)  
        else:  
            if ".patch" in filepath:
                allfile.append(filepath)  
    return allfile

def autorun():
    patches_path = work_path + "Patches1"
    patch_list = findAllfile(patches_path,[])
    # 遍历629个补丁
    for patchfile in patch_list:
        patch_name = patchfile.split('/')[-1]
        data = patch_name.split('-')
        proj,id,tool = data[1],data[2],data[3].split('.')[0]        
        error_dir = ingredient_dir+proj+'/'+id+'/'
        bug = proj+'_'+id
        print("/************ Begin to run %s_%s_%s ! ************/"%(proj,id,tool))
        os.system("java -cp :"+DiffTGen_dir+"/lib/*:"+DiffTGen_dir+"/build testgen.Main "+\
"-bugid "+bug+" "+\
"-repairtool "+tool+" "+\
"-difftgendpath "+DiffTGen_dir+" "+\
"-evosuitejpath "+DiffTGen_dir+"/lib/evosutie-1.0.6.jar "+\
"-dependjpath "+error_dir+"/"+proj.lower()+id+".jar "+\
"-outputdpath "+DiffTGen_dir+"/output "+\
"-inputfpath "+error_dir+"/"+tool+"/delta.txt "+\
"-oracleinputfpath "+error_dir+"/"+tool+"/oracle.txt "+\
"-evosuitetrials 30 "+\
"-evosuitetimeout 60 "+\
"-runparallel true "+\
"-stopifoverfittingfound true "+"> "+error_dir+"/"+tool+"/"+"runlog.txt")
        print("        Run %s_%s_%s done !"%(proj,id,tool))

if __name__ == '__main__':
    autorun()
