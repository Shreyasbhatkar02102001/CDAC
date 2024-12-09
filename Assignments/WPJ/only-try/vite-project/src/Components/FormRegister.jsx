import React from 'react';
import { Container, Row, Col, Button, Form, InputGroup } from 'react-bootstrap';
import { Formik } from 'formik';
import * as yup from 'yup';

function FormRegister() {
    // Form validation schema using yup
    const schema = yup.object().shape({
        firstName: yup.string().required('First name is required'),
        lastName: yup.string().min(2, 'Too Short!').max(50, 'Too Long!').required('Last name is required'),
        username: yup.string().required('Username is required'),
        city: yup.string().required('City is required'),
        state: yup.string().required('State is required'),
        zip: yup.string().required('Zip is required'),
        terms: yup.bool().required().oneOf([true], 'Terms must be accepted'),
    });

    return (
        <Container>
            <Row className="justify-content-center mt-5">
                <Col lg="2"></Col>
                <Col lg="8">
                    <h4>Join Our Home-Cooked Food Delivery Community!</h4>
                </Col>
                <Col lg="2"></Col>
            </Row>
            <Row className="justify-content-center mt-3">
                <Col lg="2"></Col>
                <Col lg="8">
                    Become a part of our vibrant community dedicated to bringing delicious, home-cooked meals right to your doorstep. By signing up, you'll gain access to exclusive updates, resources, and opportunities to connect with fellow food enthusiasts. Don't miss out—register now to stay informed and enjoy the best home-cooked meals!
                    <hr/>
                </Col>
                <Col lg="2"></Col>
            </Row>
            
            <Row className="justify-content-center mt-2 mb-5">
                {/* First column with col-lg-2 */}
                <Col lg="2">
                    {/* Empty space on the left */}
                </Col>

                {/* Middle column with col-lg-8 */}
                <Col lg="8">
                    <Formik
                        validationSchema={schema}
                        onSubmit={(values) => {
                            console.log(values);
                        }}
                        initialValues={{
                            firstName: '',
                            lastName: '',
                            username: '',
                            city: '',
                            state: '',
                            zip: '',
                            terms: false,
                        }}
                    >
                        {({ handleSubmit, handleChange, values, touched, errors }) => (
                            <Form noValidate onSubmit={handleSubmit}>
                                <Row className="mb-3">
                                    <Form.Group as={Col} md="6" controlId="validationFormik01">
                                        <Form.Label>First name</Form.Label>
                                        <Form.Control
                                            type="text"
                                            name="firstName"
                                            value={values.firstName}
                                            onChange={handleChange}
                                            isValid={touched.firstName && !errors.firstName}
                                        />
                                        <Form.Control.Feedback>Looks good!</Form.Control.Feedback>
                                    </Form.Group>
                                    <Form.Group as={Col} md="6" controlId="validationFormik02">
                                        <Form.Label>Last name</Form.Label>
                                        <Form.Control
                                            type="text"
                                            name="lastName"
                                            value={values.lastName}
                                            onChange={handleChange}
                                            isValid={touched.lastName && !errors.lastName}
                                        />
                                        <Form.Control.Feedback>Looks good!</Form.Control.Feedback>
                                    </Form.Group>
                                </Row>

                                <Row className="mb-3">
                                    <Form.Group as={Col} md="12" controlId="validationFormikUsername">
                                        <Form.Label>Username</Form.Label>
                                        <InputGroup hasValidation>
                                            <InputGroup.Text id="inputGroupPrepend">@</InputGroup.Text>
                                            <Form.Control
                                                type="text"
                                                placeholder="Username"
                                                aria-describedby="inputGroupPrepend"
                                                name="username"
                                                value={values.username}
                                                onChange={handleChange}
                                                isInvalid={!!errors.username}
                                            />
                                            <Form.Control.Feedback type="invalid">
                                                {errors.username}
                                            </Form.Control.Feedback>
                                        </InputGroup>
                                    </Form.Group>
                                </Row>

                                <Row className="mb-3">
                                    <Form.Group as={Col} md="6" controlId="validationFormik03">
                                        <Form.Label>City</Form.Label>
                                        <Form.Control
                                            type="text"
                                            name="city"
                                            value={values.city}
                                            onChange={handleChange}
                                            isInvalid={!!errors.city}
                                        />
                                        <Form.Control.Feedback type="invalid">
                                            {errors.city}
                                        </Form.Control.Feedback>
                                    </Form.Group>

                                    <Form.Group as={Col} md="3" controlId="validationFormik04">
                                        <Form.Label>State</Form.Label>
                                        <Form.Control
                                            type="text"
                                            name="state"
                                            value={values.state}
                                            onChange={handleChange}
                                            isInvalid={!!errors.state}
                                        />
                                        <Form.Control.Feedback type="invalid">
                                            {errors.state}
                                        </Form.Control.Feedback>
                                    </Form.Group>

                                    <Form.Group as={Col} md="3" controlId="validationFormik05">
                                        <Form.Label>Zip</Form.Label>
                                        <Form.Control
                                            type="text"
                                            name="zip"
                                            value={values.zip}
                                            onChange={handleChange}
                                            isInvalid={!!errors.zip}
                                        />
                                        <Form.Control.Feedback type="invalid">
                                            {errors.zip}
                                        </Form.Control.Feedback>
                                    </Form.Group>
                                </Row>

                                <Form.Group className="mb-3">
                                    <Form.Check
                                        required
                                        name="terms"
                                        label="Agree to terms and conditions"
                                        onChange={handleChange}
                                        isInvalid={!!errors.terms}
                                        feedback={errors.terms}
                                        feedbackType="invalid"
                                    />
                                </Form.Group>

                                <Button type="submit">Register</Button>
                            </Form>
                        )}
                    </Formik>
                </Col>

                {/* Third column with col-lg-2 */}
                <Col lg="2">
                    {/* Empty space on the right */}
                </Col>
            </Row>
        </Container>
    );
}

export default FormRegister;
