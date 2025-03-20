const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm4404l/",
            name: "ssm4404l",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm4404l/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "培训学校教学管理平台"
        } 
    }
}
export default base
