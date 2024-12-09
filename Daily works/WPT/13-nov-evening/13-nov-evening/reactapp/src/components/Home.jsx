import { Alert, Button, Container } from "react-bootstrap";
import { useDispatch, useSelector } from "react-redux";
import { decrementScore, incrementScore } from "../actions/ScoreActions";

export function Home(){

    const score = useSelector(state=>state.scoreReducer.score);
    const dispatch = useDispatch();

    const handlePlusClick = ()=>{
        dispatch(incrementScore());
    }

    const handleMinusClick = ()=>{
        dispatch(decrementScore());
    }

    console.log("score",score);

    return (
        <Container className="mt-4">
            <Alert>
                Welcome to Product inventory app
            </Alert>
            <p>You can perform CRUD on product</p>
            <Container>
                <h1>{score}</h1>
                <Button style={{marginRight:'20px'}} onClick={handlePlusClick}>+</Button>
                <Button onClick={handleMinusClick}>-</Button>
            </Container>
        </Container>
    )
}