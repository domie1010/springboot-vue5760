const base = {
    get() {
        return {
            url : "http://localhost:8080/xiaoyuanyiqingfangkongxinxiguanlixitong/",
            name: "xiaoyuanyiqingfangkongxinxiguanlixitong",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/xiaoyuanyiqingfangkongxinxiguanlixitong/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "校园疫情防控信息管理系统"
        } 
    }
}
export default base
