import { Alert, Container } from "react-bootstrap";

export function Home(){
    return (
        <Container className="mt-4">
            <Alert>
                Welcome to Product inventory app
            </Alert>
            <p>You can perform CRUD on product</p>
        </Container>
    )
}