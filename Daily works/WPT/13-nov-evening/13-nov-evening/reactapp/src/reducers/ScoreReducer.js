const initialState = {
    score:0
}

export const scoreReducer = (state=initialState,action)=>{
    switch(action.type){
        case "INCREMENT": return { score: state.score + 4};
        case "DECREMENT": return { score: state.score - 1};
        default: return state; // to read the data from redux store
    }
}
