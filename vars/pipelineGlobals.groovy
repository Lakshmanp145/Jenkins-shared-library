def getAccountID(String environment){
    switch(environment) { 
        case 'dev': 
            return "503561459301"
        case 'qa':
            return "503561459301"
        case 'uat':
            return "503561459301"
        case 'pre-prod':
            return "503561459301"
        case 'prod':
            return "503561459301"
        default:
            return "nothing"
    } 
}