import React from 'react';
import { Container, Row, Col, Button, Form, InputGroup } from 'react-bootstrap';
import { Formik } from 'formik';
import * as yup from 'yup';

function SignIn() {
    // Form validation schema using yup
    const schema = yup.object().shape({
        email: yup.string().email('Invalid email address').required('Email is required'),
        password: yup.string().required('Password is required'),
    });

    return (
        <Container>
            <Row className="justify-content-center mt-5">
                <Col lg="2"></Col>
                <Col lg="8">
                    <h4>Sign In to Your Account</h4>
                </Col>
                <Col lg="2"></Col>
            </Row>
            <Row className="justify-content-center mt-3">
                <Col lg="2"></Col>
                <Col lg="8">
                    <p>Welcome back! Please enter your credentials to sign in and access your account.</p>
                    <hr />
                </Col>
                <Col lg="2"></Col>
            </Row>

            <Row className="justify-content-center mt-2 mb-5">
                {/* First column with col-lg-2 */}
                <Col lg="2"></Col>

                {/* Middle column with col-lg-8 */}
                <Col lg="8">
                    <Formik
                        validationSchema={schema}
                        onSubmit={(values) => {
                            console.log(values);
                        }}
                        initialValues={{
                            email: '',
                            password: '',
                        }}
                    >
                        {({ handleSubmit, handleChange, values, touched, errors }) => (
                            <Form noValidate onSubmit={handleSubmit}>
                                <Row className="mb-3">
                                    <Form.Group as={Col} md="12" controlId="validationFormikEmail">
                                        <Form.Label>Email Address</Form.Label>
                                        <InputGroup hasValidation>
                                            <InputGroup.Text id="inputGroupPrepend">@</InputGroup.Text>
                                            <Form.Control
                                                type="email"
                                                placeholder="Enter your email"
                                                aria-describedby="inputGroupPrepend"
                                                name="email"
                                                value={values.email}
                                                onChange={handleChange}
                                                isInvalid={!!errors.email}
                                            />
                                            <Form.Control.Feedback type="invalid">
                                                {errors.email}
                                            </Form.Control.Feedback>
                                        </InputGroup>
                                    </Form.Group>

                                    {/* Display message below email field */}
                                    <Form.Text className="text-muted">
                                        We'll never share your email with anyone else.
                                    </Form.Text>
                                </Row>

                                <Row className="mb-3">
                                    <Form.Group as={Col} md="12" controlId="validationFormikPassword">
                                        <Form.Label>Password</Form.Label>
                                        <Form.Control
                                            type="password"
                                            placeholder="Password"
                                            name="password"
                                            value={values.password}
                                            onChange={handleChange}
                                            isInvalid={!!errors.password}
                                        />
                                        <Form.Control.Feedback type="invalid">
                                            {errors.password}
                                        </Form.Control.Feedback>
                                    </Form.Group>
                                </Row>

                                <Button type="submit">Sign In</Button>
                            </Form>
                        )}
                    </Formik>
                </Col>

                {/* Third column with col-lg-2 */}
                <Col lg="2"></Col>
            </Row>
        </Container>
    );
}

export default SignIn;
