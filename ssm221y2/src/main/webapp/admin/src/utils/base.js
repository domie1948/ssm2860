const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm221y2/",
            name: "ssm221y2",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm221y2/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "物流管理系统"
        } 
    }
}
export default base
